import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustInsertTest {
    final CustService service;

    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id99").pwd("pwd99").name("james").build();

        try {
            service.add(obj);
        } catch (Exception e){
            System.out.print(e.getMessage());
        }

    }
}