package gaoxugang.pojo;

/**
 * @author gaoxugang
 * @data 2019/7/9
 * @description TODO
 */
public class ClientServiceExp {
	/**
	 * 类变量
	 */
	private static ClientServiceExp clientServiceExp = new ClientServiceExp();

	/**
	 * 构造方法私有化禁止外部构建对象
	 */
	private ClientServiceExp() {

	}

	public static ClientServiceExp createInstance() {
		return clientServiceExp;
	}
}
