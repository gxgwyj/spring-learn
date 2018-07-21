package gaoxugang.pojo;

/**
 * 类: ClientService <br>
 * 描述: ${DESCRIPTION}<br>
 * 作者: gaoxugang <br>
 * 时间: 2018年01月23日 10:02
 */
public class ClientService {

	private static ClientService clientService = new ClientService();
	private ClientService(){}

	public static ClientService createInstance(String ip,String port){
		System.out.println("ip="+ip +";port="+port);
		return clientService;
	}
}
