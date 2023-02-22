public class DummyDto {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static DummyDto from(Dummy dummy){
        DummyDto dummyDto = new DummyDto();
        dummyDto.setName(dummy.getFirstName()+dummy.getLastName());
        return dummyDto;
    }
}
