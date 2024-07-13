package haak.haak.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@ConfigurationProperties(prefix="info.app")
@Component
class AppInfo{
    lateinit var name:String
    lateinit var version:String
    lateinit var description:String
    
}





@RestController
@RequestMapping("/app")
class AppInfoController(private val appinfo){

    @GetMapping("/info")
    fun info():AppInfo{
        return appinfo;
    }
}