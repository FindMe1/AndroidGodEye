package cn.hikyson.godeye.monitor.modules;

import java.util.Collection;

import cn.hikyson.godeye.core.internal.modules.pageload.PageloadInfo;
import cn.hikyson.godeye.monitor.driver.Pipe;

/**
 * Created by kysonchao on 2017/9/29.
 */
public class PageloadModule extends BaseListModule<PageloadInfo> {

    @Override
    Collection<PageloadInfo> popData() {
        return Pipe.instance().popPageloadInfo();
    }
}
