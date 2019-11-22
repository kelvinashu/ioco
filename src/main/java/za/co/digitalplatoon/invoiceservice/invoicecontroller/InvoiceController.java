package za.co.digitalplatoon.invoiceservice.invoicecontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import za.co.digitalplatoon.invoiceservice.invoice.Invoice;
import za.co.digitalplatoon.invoiceservice.service.InvoiceService;

@RestController
@RequestMapping("/api")
public class InvoiceController {

	@Autowired
	private InvoiceService invoiceService;

	@PostMapping("/addInvoice")
	public Invoice addInvoice(@RequestBody @Valid Invoice invoice) {
		return invoiceService.addInvoice(invoice);
	}

	@GetMapping("/viewAllInvoices")
	public List<Invoice> viewAllInvoices() {
		return invoiceService.viewAllInvoices();

	}

	@GetMapping("/viewInvoice/{id}")
	public Invoice viewInvoice(@PathVariable(name = "id") int id) {
		return invoiceService.viewInvoice(new Long(id)).get();

	}

}
