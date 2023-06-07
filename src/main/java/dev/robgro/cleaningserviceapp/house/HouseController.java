package dev.robgro.cleaningserviceapp.house;

import dev.robgro.cleaningserviceapp.client.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HouseController {

    private final HouseService houseService;
    private final ClientService clientService;

    public HouseController(HouseService houseService, ClientService clientService) {
        this.houseService = houseService;
        this.clientService = clientService;
    }

    @RequestMapping({"", "/", "/index"})
    public String homePage() {
        return "index";
    }

    @GetMapping({"/houses", "/houses.html"})
    public String housesList(Model model) {
        model.addAttribute("housesList", houseService.getAllHouses());
        return "houses";
    }

    @GetMapping("/houses/new")
    public String showNewHouseForm(Model model) {
        model.addAttribute("house", new House());
        return "house_new_form";
    }

    @GetMapping("/houses/{id}/edit")
    public String showEditHouseForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("house", houseService.getHouseById(id));
        return "house_edit_form";
    }

    //todo Client DTO

    @PostMapping("/houses/save")
    public String saveHouse(@ModelAttribute House house) {
        houseService.saveHouse(house);
        return "redirect:/houses";
    }

    @GetMapping("/houses/{id}/delete")
    public String deleteHouse(@PathVariable("id") Long id) {
        houseService.deleteHouseById(id);
        return "redirect:/houses";
    }

    @GetMapping("/clients/{clientId}/housesList")
    public String getClientHousesList(@PathVariable ("clientId")Long clientId, Model model) {
        model.addAttribute("clientHousesList", houseService.clientHousesList(clientId));
        model.addAttribute("client", clientService.getClientById(clientId));
        return "client_houses_list";
    }

    @GetMapping("/changes")
    public String chooseClient(Model model) {
        model.addAttribute("housesList", houseService.getAllHouses());
        model.addAttribute("clientsList", clientService.getAllClients());
        return "changes";
    }
}