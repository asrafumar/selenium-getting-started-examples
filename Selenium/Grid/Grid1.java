package Grid;

public class Grid1 {

	/*
	GridHubConfiguration config = new GridHubConfiguration()
    config.setHost("localhost")
    config.setTimeout(60000000)
    Hub hub = new Hub(config)
    hub.start()

    RegistrationRequest req = new RegistrationRequest()
    req.setRole(GridRole.NODE)


    Map<String, Object> nodeConfiguration = new HashMap<String, Object>();

    nodeConfiguration.put(RegistrationRequest.PROXY_CLASS, "org.openqa.grid.selenium.proxy.DefaultRemoteProxy")
    nodeConfiguration.put(RegistrationRequest.MAX_SESSION, 25)
    nodeConfiguration.put(RegistrationRequest.PORT, 5555)
    nodeConfiguration.put(RegistrationRequest.HOST, hub.getHost())
    nodeConfiguration.put(RegistrationRequest.AUTO_REGISTER, true)
    nodeConfiguration.put(RegistrationRequest.REGISTER_CYCLE, 5000)
    nodeConfiguration.put(RegistrationRequest.HUB_HOST, hub.getHost())
    nodeConfiguration.put(RegistrationRequest.HUB_PORT, hub.getPort())
    URL remoteURL = new URL("http://" + hub.getHost() + ":" + 5555)
    nodeConfiguration.put(RegistrationRequest.REMOTE_HOST, remoteURL)

    req.setConfiguration(nodeConfiguration)

    DesiredCapabilities capabilities = DesiredCapabilities.chrome()
    capabilities.setCapability("browserName","chrome")
    capabilities.setCapability("maxInstances",25)
    capabilities.setCapability("seleniumProtocol","Selenium")

    req.setCapabilities([capabilities]);

    SelfRegisteringRemote remote = new SelfRegisteringRemote(req)
    remote.startRemoteServer()
    remote.startRegistrationProcess()
    */
}
