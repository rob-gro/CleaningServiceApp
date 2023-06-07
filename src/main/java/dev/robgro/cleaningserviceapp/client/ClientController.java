package dev.robgro.cleaningserviceapp.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients/new")
    public String newClient(Model model) {
        model.addAttribute("client", new Client());
        return "client_new_form";
    }

    @GetMapping({"/clients","/clients.html"})
    public String clientsList(Model model) {
        model.addAttribute("clientsList", clientService.getAllClients());
        return "clients";
    }

    //todo Client DTO

    @PostMapping("/clients/save")
    public String saveClient(@ModelAttribute("clients") Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/clients/{id}/edit")
    public String editClient(@PathVariable("id") Long id, Model model) {
        model.addAttribute("client", clientService.getClientById(id));
        return "client_edit_form";
    }

    @GetMapping("/clients/{id}/delete")
    public String deleteClient(@PathVariable("id") Long id) {
        clientService.deleteClientById(id);
        return "redirect:/clients";
    }
}