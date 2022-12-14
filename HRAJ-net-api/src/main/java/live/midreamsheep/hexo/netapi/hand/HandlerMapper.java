package live.midreamsheep.hexo.netapi.hand;

import live.midreamsheep.hexo.netapi.hand.handlers.*;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapper {
    public static final Map<Integer,HandlerInter> handlerMap = new HashMap<>();
    static {
        handlerMap.put(HandlerEnum.ADD_DIR.getId(),new AddDir());
        handlerMap.put(HandlerEnum.ADD_FILE.getId(),new AddFile());
        handlerMap.put(HandlerEnum.DELETE_DIR.getId(),new DeleteDir());
        handlerMap.put(HandlerEnum.DELETE_FILE.getId(),new DeleteFile());
        handlerMap.put(HandlerEnum.UPDATE_FILE.getId(),new UpdateAFile());
        handlerMap.put(HandlerEnum.DPUSH.getId(),new DPush());
        handlerMap.put(HandlerEnum.PULL.getId(),new Pull());
        handlerMap.put(HandlerEnum.PUSH.getId(),new Push());
        handlerMap.put(HandlerEnum.SERVER.getId(),new Server());
        handlerMap.put(HandlerEnum.SERVER_STOP.getId(),new ServerStop());
    }
}
