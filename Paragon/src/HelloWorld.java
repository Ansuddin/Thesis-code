import java.lang.*;
import io.kamax.matrix.client.*;
import io.kamax.matrix.client.regular.*;
import java.net.*;
public class HelloWorld
{
  public static void main(java.lang.String[] args) throws java.net.MalformedURLException
  {
    java.net.URL hsBaseUrl = new java.net.URL("https://ansuddin.xyz");
    io.kamax.matrix.client.MatrixClientContext context = new io.kamax.matrix.client.MatrixClientContext();
    context.setHsBaseUrl(hsBaseUrl);
    io.kamax.matrix.client.regular.MatrixHttpClient client = new io.kamax.matrix.client.regular.MatrixHttpClient(context);
    java.lang.System.out.println(client.getContext().getHsBaseUrl());
  }
}