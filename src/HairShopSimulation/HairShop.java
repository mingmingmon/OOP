package HairShopSimulation;

import java.util.ArrayList;

class Customer{
    private String name;
    private int age;
    private String preferStylist = "없음";
    private ArrayList<String> serviceChoice;

    Customer(String name, int age, String preferStylist,
             ArrayList<String> serviceChoice){
        this.name = name;
        this.age = age;
        this.preferStylist = preferStylist;
        this.serviceChoice = serviceChoice;
    }

    Customer(String name, int age, String preferStylist){
        this.name = name;
        this.age = age;
        this.preferStylist = preferStylist;
    }

    Customer(String name, int age,
             ArrayList<String> serviceChoice){
        this.name = name;
        this.age = age;
        this.serviceChoice = serviceChoice;
    }

    Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getName(){
        System.out.printf("%s요.\n", this.name);
    }

    void getAge(){
        System.out.printf("%d살이요.\n", this.age);
    }

    void getPreferStylist(){
        if(this.preferStylist.equals("없음")){
            System.out.println("아니요. 없어요.");
        }
        else{
            System.out.printf("%s 선생님이요.\n", this.preferStylist);
        }
    }

    void getTreatmentChoice(){
        if(serviceChoice.isEmpty()){
            System.out.println("그냥 스타일 바꾸고 싶어서 왔는데 아직 못 정했어요.");
        }
        else{
            for(String choice : serviceChoice){
                System.out.printf("%s ", choice);
            }
            System.out.println("하러 왔어요.");
        }
    }
}

class CounterManager{
    private String name;

    CounterManager(String name){
        this.name = name;
    }

    void responseWhenGuestsCome(Customer customer){
        System.out.println("안녕하세요~ 니츠 헤어샵입니다~ 성함이 어떻게 되세요?");
        customer.getName();
        System.out.println("나이는 어떻게 되세요?");
        customer.getAge();
        System.out.println("혹시 찾으시는 선생님 있으신가요?");
        customer.getPreferStylist();
        System.out.println("어떤거 하러 오셨어요?");
        customer.getTreatmentChoice();
        System.out.println("잠시만 기다려주세요. 바로 세팅해드릴게요~");
    }
}

public class HairShop {
    void run(){
        CounterManager manager = new CounterManager("리사");

        ArrayList<String> servicesForCustomer1 = new ArrayList<>();
        servicesForCustomer1.add("파마");
        servicesForCustomer1.add("염색");
        Customer customer1 = new Customer("전민주", 22, servicesForCustomer1);

        manager.responseWhenGuestsCome(customer1);

        System.out.println("");

        ArrayList<String> servicesForCustomer2 = new ArrayList<>();
        Customer customer2 = new Customer("김나희", 28, "차홍", servicesForCustomer2);

        manager.responseWhenGuestsCome(customer2);
    }

    public static void main(String[] args) {
        HairShop hairShopSimulation = new HairShop();
        hairShopSimulation.run();
    }
}
