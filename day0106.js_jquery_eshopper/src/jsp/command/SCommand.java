package jsp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SCommand {
	void execute(HttpServletRequest request, HttpServletResponse response);	
}
