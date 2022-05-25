import com.example.Product;
import com.example.ProductBO;
import com.example.ProductBOImp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class DisplayProductDetails extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductBO bo = new ProductBOImp();
        Product product = bo.findProduct(Integer.parseInt(req.getParameter("id")));

        PrintWriter out = resp.getWriter();
        out.print("Product details");
        out.print("Product Id :"+product.getId());
        out.print("Product Name :"+product.getName());
        out.print("Product Description :"+product.getDescription());
        out.print("Product Price :"+product.getPrice());
    }
}

