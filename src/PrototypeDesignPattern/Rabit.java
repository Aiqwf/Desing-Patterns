package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Rabit implements Cloneable{
    RabitFamilyTree familyTree;
    String name;
List<String> list ;
    RabitFamilyTree family;
    public Rabit(String name) {
        this.name=name;
        list  = new ArrayList<>();
list.add("NewCreatedList");

    }
    public void setFamily(RabitFamilyTree family) {
        this.family=family;

    }
    @Override
    public String toString() {
        return "Rabit{" +
                "name='" + name + '\'' +
                ", family=" + family +
                '}';
    }

    @Override
    public Rabit clone()  {
        try {
            Rabit rabit = (Rabit) super.clone();
            rabit.setFamily((RabitFamilyTree) rabit.family.clone());
            return rabit;
        } catch (CloneNotSupportedException e) {
         throw new AssertionError();

        }

    }

    private ParameterizedTypeReference instance;


    public ParameterizedTypeReference instanceOfParameterizedTypeReference (){
        if(instance==null)
    }

    public List<BankCodesSwiftDto> getSwiftList(SwiftBankCodeRequest swiftBankCodeRequest) {
        List<BankCodesSwiftDto> responseList = new ArrayList<>();

        ResponseEntity<Map<String, BankCodesSwiftDto>> map = restClient.getListWithExchange(
                String.format(
                        urlConfiguration.getCodesSwiftUrl(),
                        swiftBankCodeRequest.getSwift().getFrom(),
                        swiftBankCodeRequest.getSwift().getTo()),
                new ParameterizedTypeReference < Map < String, BankCodesSwiftDto > >() {
                }
                //Same Class || Interface
                //Creating new One every reqeust

                );


        if (Objects.isNull(map.getBody()))
            SwiftBankCodesException.of(BusinessStatus.ERROR_NULL_SWIFT_CODES_RESPONSE).throwEx();

        map.getBody().forEach((key, value) -> responseList.add(value));

        //sorting list by bic code.
        responseList.sort(Comparator.comparing(BankCodesSwiftDto::getBicCode));

        return responseList;
    }





}
