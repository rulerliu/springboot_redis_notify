package org.example.controller;

import org.example.entity.HostInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostInfoController {

    @RequestMapping("test")
    public HostInfo test() {
        HostInfo hostInfo = new HostInfo();
        hostInfo.setId(1L);
        HostInfo hostInfo1 = hostInfo.selectById();
        return hostInfo1;
    }

}
