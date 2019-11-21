package za.co.digitalplatoon.invoiceservice.service;

import java.util.List;

import za.co.digitalplatoon.invoiceservice.invoice.Invoice;

public interface InvoiceService {

	Invoice viewInvoice(Invoice invoice);

	List<Invoice> viewAllInvoices();

	Invoice addInvoice(Invoice invoice);

}
