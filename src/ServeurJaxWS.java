import web.BanqueService;

import javax.xml.ws.Endpoint;

public class ServeurJaxWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8086/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service started in URL : "+url);
    }
}
