package cn.wxh.vmalluser;

//import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "cn.wxh.vmalluser.mapper")
public class VmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmallUserApplication.class, args);
    }

}
