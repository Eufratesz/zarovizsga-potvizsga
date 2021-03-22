package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CleaningService {

    List<Cleanable> service = new ArrayList<>();

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(service);
    }

    public void add(Cleanable cleanable) {
        service.add(cleanable);

    }


    public int cleanAll() {
        int result = 0;
        for (Cleanable cleanable : service) {
            result +=cleanable.clean();


        }
        service.clear();
        return result;
    }


    public int cleanOnlyOffices() {
        int result = 0;
        for (Cleanable cleanable : service) {
            if(cleanable.isOffice()){
                result +=cleanable.clean();
            }
        }
        return result;
    }

    private boolean isOffice(Cleanable cleanable){
        if(cleanable.clean());

    }


    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable>found = new ArrayList<>();
        for(Cleanable cleanable : service){
            if(cleanable.getAddress().contains(address)){
                found.add(cleanable);
            }
        }
        return found;
    }

    public String getAddresses(){
        String addresses = null;

        for(Cleanable cleanable : service) {

            StringBuilder sb = new StringBuilder();

            addresses =sb.append(cleanable.getAddress() + ", ").toString();

        }
        return addresses;
    }
}
