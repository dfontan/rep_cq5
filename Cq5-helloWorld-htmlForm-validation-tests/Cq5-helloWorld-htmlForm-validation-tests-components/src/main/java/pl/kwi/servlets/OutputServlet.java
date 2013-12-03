package pl.kwi.servlets;

import java.io.IOException;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

@Component(immediate=true, metatype=false, label="OUTPUT SERVLET")
@Service
@Properties(value = {
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.methods", value={"POST"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.resourceTypes", value={"sling/servlet/default"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.selectors", value={"OUTPUT"}),
    @org.apache.felix.scr.annotations.Property(name="sling.servlet.extensions", value={"html"})
})
public class OutputServlet extends SlingAllMethodsServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,
			IOException {
		
		String redirectPath = request.getParameter("redirectPath") + ".html";
		
		response.sendRedirect(redirectPath);
		
	}

}
