import org.apache.nifi.web.security.ProxiedEntitiesUtils;

public class Runner {

    public static void main(String[] args) {
        System.out.println("before vulnerable element called");
        String dummyString = ProxiedEntitiesUtils.formatProxyDn("dummyString");
        System.out.println(dummyString);
    }
}
