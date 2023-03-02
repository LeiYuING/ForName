package com.leiyu.Controller;

import com.leiyu.Service.FornameService;
import com.leiyu.pojo.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class FornameController {
    @Autowired
    private FornameService fornameService;


    @RequestMapping("/getName")
    @ResponseBody
    public List<String> getName(@RequestParam("zodiac") @Nullable String zodiac, @RequestParam("disposition") @Nullable String disposition,
                              @RequestParam("tdgz") @Nullable String tdgz, @RequestParam("allusion") @Nullable String allusion,
                              @RequestParam("surname") String surname, @RequestParam("isDouble") int isDouble, @RequestParam("gender") int gender){
        Map<String, String> map = new HashMap<>();
        map.put("zodiac",zodiac);
        map.put("disposition",disposition);
        map.put("tdgz",tdgz);
        map.put("allusion",allusion);
        map.put("surname",surname);
        map.put("isDouble",String.valueOf(isDouble));
        map.put("gender", String.valueOf(gender));
        List<String> name = fornameService.getName(map);
        return name;
    }
}
