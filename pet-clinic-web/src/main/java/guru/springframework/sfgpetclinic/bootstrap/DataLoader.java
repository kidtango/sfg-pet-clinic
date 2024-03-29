package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner scott = new Owner();
        scott.setFirstName("Scott");
        scott.setLastName("Tang");

        ownerService.save(scott);

        Owner tiffany = new Owner();
        tiffany.setLastName("Nguyen");
        tiffany.setFirstName("Tiffany");

        ownerService.save(tiffany);

        System.out.println("Loaded Owners...");

        Vet vetSam = new Vet();
        vetSam.setFirstName("Sam");
        vetSam.setLastName("Axe");

        vetService.save(vetSam);

        Vet vetJack = new Vet();
        vetJack.setFirstName("Jack");
        vetJack.setLastName("Samson");

        vetService.save(vetJack);
    }
}
