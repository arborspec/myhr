package hr.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class Test {

	@RequestMapping("Rtest")
	public String Rtest() {
		System.out.println("Œ“ «≤‚ ‘◊¢Ω‚…®√Ë");
		return null;	
	}
}
