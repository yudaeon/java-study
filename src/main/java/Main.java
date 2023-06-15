import java.util.Optional;

public class Main {
    public static String nullableMethod(){
        return null;
    }

    public static void main(String[] args) {
       String result =  nullableMethod();

        Optional<String> optionalValue = Optional.ofNullable(result);

        if (optionalValue.isPresent()) {  // 데이터를 가지고 있을 때
            System.out.println("Value is present: " + optionalValue.get());
        } else {  // 데이터가 존재하지 않을 때
            System.out.println("Value is not present");
        }
        //Optional<T>.orElse(T other): 데이터가 없을때 other를 대신 사용
        optionalValue.orElse("Value is: " + optionalValue.orElse("null"));
        //데이터가 있으면 데이터를 반환하고 데이터가 없으면 어떤 데이터를 반환할지 결정해주는거
    }
}