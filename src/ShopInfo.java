import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(
    targetNamespace = "http://sellmegood.com",
    name = "ShopInfoImpl"
)
@SOAPBinding(
    style = SOAPBinding.Style.RPC
)
public interface ShopInfo {
    @WebMethod(
        action = "get_shop_info",
        operationName = "getShopInfo"
    )
    @WebResult(
        partName = "shopInfo"
    )
    String getShopInfo (@WebParam(partName = "property") String property) throws InvalidInputException;
}
