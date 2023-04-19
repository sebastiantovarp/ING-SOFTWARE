package ingsof.calendar.appCalendar.controller;

//import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
//import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@RestController
@RequestMapping("/events")
public class EventController {

    private Calendar calendar;

    @GetMapping
    public List<Event> getEvents() throws IOException {
        DateTime now = new DateTime(System.currentTimeMillis());
        Events events = calendar.events().list("primary")
                .setMaxResults(10)
                .setTimeMin(now)
                .setOrderBy("startTime")
                .setSingleEvents(true)
                .execute();
        return events.getItems();
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) throws IOException {
        return calendar.events().insert("primary", event).execute();
    }

    @PutMapping("/{eventId}")
    public Event updateEvent(@PathVariable String eventId, @RequestBody Event event) throws IOException {
        return calendar.events().update("primary", eventId, event).execute();
    }

    @DeleteMapping("/{eventId}")
    public void deleteEvent(@PathVariable String eventId) throws IOException {
        calendar.events().delete("primary", eventId).execute();
    }
}


