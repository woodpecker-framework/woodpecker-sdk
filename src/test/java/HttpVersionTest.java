import me.gv7.woodpecker.httpclient.HttpClientUtil;
import me.gv7.woodpecker.httpclient.builder.HCB;
import me.gv7.woodpecker.httpclient.common.HttpConfig;
import me.gv7.woodpecker.httpclient.common.HttpMethods;
import me.gv7.woodpecker.httpclient.common.HttpResult;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HTTP;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.util.HashMap;
import java.util.Map;

public class HttpVersionTest {

    public static void main(String[] args) {
        try {
            String url = "https://180.168.81.201/cms/jeeadmin/jeecms/login.do";
            url = "https://106.13.189.179/";
            HttpConfig config = HttpConfig.custom();
            HCB client = HCB.custom().ssl();
            //client.proxy("127.0.0.1",8080);
            config.client(client.build());
            //简单调用
            HttpResult resp = HttpClientUtil.sendAndGetResp(config.url(url));
            System.out.println(resp.getStatusCode());

            //config.httpVersion(HttpVersion.HTTP_1_0);
//            Map map = new HashMap<String, Object>();
//            map.put("b","b");
//            map.put("c","c");
//            config.method(HttpMethods.POST).map(map);
//            resp = HttpClientUtil.sendAndGetResp(config.url(url));
//            System.out.println(resp.getStatusCode());


            //HttpPost httpPost = new HttpPost(url);
            //httpPost.setEntity(new StringEntity(text, ContentType.create("application/json", this.getCharset())));
            //httpPost.setProtocolVersion(HttpVersion.HTTP_1_0);
           // httpPost.addHeader(HTTP.CONN_DIRECTIVE, HTTP.CONN_CLOSE);
            
//            CloseableHttpClient httpClient = HttpClients.createDefault();
//            HttpResponse resp1 = httpClient.execute(httpPost);
//            System.out.println(resp1.getStatusLine().getStatusCode());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
