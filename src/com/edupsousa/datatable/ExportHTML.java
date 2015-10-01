package com.edupsousa.datatable;

import java.util.LinkedHashMap;

public class ExportHTML implements ExportFile {

	@Override
	public String export(DataTable dt,
			LinkedHashMap<String, Integer> columnsTypes) {
		DataTableRow row;
		String output = "";

		output += "<table>\n";
		output += "<tr>";
		for (String collumnName : columnsTypes.keySet()) {
			output += "<td>" + collumnName + "</td>";

		}
		output += "</tr>";
		output += "\n";

		for (int i = 0; i < dt.rowsCount(); i++) {
			row = dt.getRow(i);
			output += "<tr>";
			for (String collumnName : columnsTypes.keySet()) {
				output += "<td>" + row.getValue(collumnName) + "</td>";
			}
			output += "</tr>";
			output += "\n";
		}
		output += "</table>";
		output += "\n";

		return output;
	}

}
