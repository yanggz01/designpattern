package proxy.interfaceproxy;

public interface IUserController {

    UserVo login(String telephone, String password);

    UserVo register(String telephone, String password);
}
