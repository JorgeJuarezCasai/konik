/*
 * Copyright (C) 2014 konik.io
 *
 * This file is part of Konik library.
 *
 * Konik library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Konik library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Konik library.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.konik.zugferd;

@SuppressWarnings("javadoc")
public class SampleInvoiceValidationRoundtripTest {

   //   
   //   @Test
   //   public void unmarshallExistingInvoiceAndValidateOutput() throws SAXException, IOException, JAXBException {
   //      //setup
   //      Marshaller marshaller = InvoiceLoaderUtils.createZfMarshaller();
   //      Invoice invoice = InvoiceLoaderUtils.loadInvoice();
   //
   //      //exec
   //      StringWriter stringWriter = new StringWriter(10000);
   //      marshaller.marshal(invoice, stringWriter);
   //      //marshaller.marshal(invoice, new File("sample_invoice_out.xml"));
   //
   //      StringReader reader = new StringReader(stringWriter.toString());
   //      getSchemaValidator().validate(new StreamSource(reader));
   //   }
   //   
   //   @Test
   //   public void validateExistingInvoiceAginstSchema() throws SAXException, IOException {
   //      Source xmlSource = InvoiceLoaderUtils.loadZfBasicXmlInvoice();
   //      Validator validator = InvoiceLoaderUtils.getSchemaValidator();
   //      validator.validate(xmlSource);
   //   }
}
