package KenTesting.kentesting;



import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.List;
import entitys.Invoice;
import entitys.LineItem;
import javassist.NotFoundException;
import methods.InvoiceRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Controller
public class InvoiceController
{

	@Autowired
	private InvoiceRepository invoiceData;
	

	@RequestMapping(value = "/invoice", method = RequestMethod.POST)
	public String newInvoice(Invoice invoice , LineItem item) {

		invoiceData.save(invoice);
		return ("redirect:/invoices");
	}

	@RequestMapping(value = "/invoice", method = RequestMethod.GET)
	public ModelAndView addInvoice() {

		Invoice invc = new Invoice();
		return new ModelAndView("newInvoice", "form", invc);
	}

	@RequestMapping(value = "/invoices", method = RequestMethod.GET)
	public ModelAndView viewAllInvoices() {
		List<Invoice> allInvoices = invoiceData.findAll();
		return new ModelAndView("allInvoices", "invoices", allInvoices);

	}
	
	@GetMapping("/invoices/{id}")
	public ModelAndView viewInvoice(@PathVariable String id) throws NotFoundException 
	{
		 long ids = Long.parseLong(id);
		 
		Optional<Invoice> invoice = invoiceData.findById(ids);

		if (!invoice.isPresent()) throw new NotFoundException("id-" + ids);

		return new ModelAndView("invoice", "invoice", invoice);

	}
	
	
}
