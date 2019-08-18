package gaoxugang.di;

/**
 * @author gaoxugang
 * @data 2019/8/18 0018 11:39
 * @description TODO
 */
public abstract class CommandManager {
	public void  process() {
		// grab a new instance of the appropriate Command interface
		Command command = createCommand();
		// set the state on the (hopefully brand new) Command instance
		command.execute();
	}
	protected abstract Command createCommand();
}
