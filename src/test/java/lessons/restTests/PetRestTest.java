package lessons.restTests;

import org.testng.annotations.Test;
import rest.PetController;
import rest.entity.Pet;

import java.io.IOException;

public class PetRestTest {
    @Test
    public void petRestTest() throws IOException {
        PetController petController = new PetController();
     //   petController.findByStatus("available");

      //  petController.createNewPet();
        //petController.createNewPathJson("JsonPet");


        Pet pet = new Pet();
        pet.setId(112233);
        pet.setName("GsonPet");
        pet.setStatus("pending");

        petController.createNewPetWithJSON(pet);

    }
}
