package map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class WeatherApiTest {
   private String nx = "61";   // 위도 엑셀파일 참고, 워드파일 참고
   private String ny = "125"; // 경도
   private String baseDate = "20221130"; //조회하려는 날짜 (최근 3일만 가능)
   private String baseTime = "2300"; //조회하려는 시간
   private String dataType = "json"; //데이터 형식 JSON
   
   public void getWeatherData() throws Exception{
      String apiUrl = "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst";
      String serviceKey = "xJrBpHgAj1p3H%2BqYTP7UwQ8kRwsmWkcDQujwlgy6mgZfE57HRIik96zPbcRJ5%2BUfIthd0sOrtq2muEMfmEDc1g%3D%3D";
      
      //http 통신에 필요한 객체를 담을 변수
      URL url = null;
      HttpURLConnection conn = null;
      
      //http통신 요청 후 데이터를 받기위한 변수
      BufferedReader br =  null;
      StringBuilder sb = new StringBuilder();
      
      String temp = null, result = null;
      StringBuilder builder = new StringBuilder(apiUrl);
      builder.append("?ServiceKey="+serviceKey)
      .append("&ny=" + ny)
      .append("&nx=" + nx)
      .append("&base_date="+baseDate)
      .append("&base_time=" + baseTime)
      .append("&dataType=" + dataType);
      
      url = new URL(builder.toString()); //StringBuilder -> String -> URL
      
      //HttpURLConnection(추상)클래스 http통신을 하기 위한 클래스
      //URL객체를 통해 HttpURLConnection객체를 얻을 수 있으므로 함께 사용한다.
      conn = (HttpURLConnection)url.openConnection();
      
      // connection 객체에  필요한 정보를 설정 해준다.
      conn.setRequestMethod("GET"); // 요청방식을 GET방식으로  한다.
      conn.setRequestProperty("Content-type", "application/json"); // content-type 설정
      
      //responseCode(서버응답코드)란 서버에 보내주는 HTTP상태 코드이다.
      // 값의  결과에 따라 상태를 알 수 있다.
      //200번대 응답은 성공
      //300번대 : 추가 동작이  필요함
      //400번대 : 클라이언트 에러
      //500번대 : 서버 에러
      if(conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) {
         //정상적으로 처리된 경우
         br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//               문자열                        문자                           바이트
      } else {
         br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
      }
      
      while((temp = br.readLine()) != null) {
         // 줄단위로  가져옴
         sb.append(temp);
      }
      
      br.close();
      conn.disconnect();
      
      result = sb.toString();
      
//      System.out.println(result);
      
      
//      JSONObject json = new JSONObject(result); //문자열은 json으로 바로 바꿀 수 없다.
      JSONParser parser = new JSONParser();
      JSONObject json = (JSONObject)parser.parse(result);
//      System.out.println(json);
      JSONObject jsonRes = (JSONObject)json.get("response");
      
      JSONObject jsonResp = (JSONObject)json.get("response");
//        System.out.println(jsonResp.get("header"));
//        System.out.println(jsonResp.get("body"));
        
        JSONObject jsonBody = (JSONObject)jsonResp.get("body");
//        System.out.println(jsonBody.get("items"));
        
        JSONObject jsonItems = (JSONObject)jsonBody.get("items");
        System.out.println(jsonItems);
        JSONArray arJson = (JSONArray)parser.parse(jsonItems.get("item").toString());
        
        for(int i=0; i<arJson.size(); i++) {
           System.out.println(arJson.get(i));
        }
   }
   
   
   public static void main(String[] args) {
      try {
         new WeatherApiTest().getWeatherData();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}