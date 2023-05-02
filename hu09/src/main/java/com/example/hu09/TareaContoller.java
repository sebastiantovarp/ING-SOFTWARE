package com.example.hu09;

@Controller
@RequestMapping("/tarea")
public class TareaController {
    private final TareaRepository tareaRepository;

    public TareaController(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    @PostMapping("/reprogramar")
    public String reprogramarTarea(@RequestParam Long id, @RequestParam LocalDate fechaLimite) {
        Tarea tarea = tareaRepository.findById(id).orElseThrow();
        tarea.setFechaLimite(fechaLimite);
        tareaRepository.save(tarea);
        return "redirect:/tarea/" + id;
    }
}

