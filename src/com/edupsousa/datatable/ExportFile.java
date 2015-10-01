package com.edupsousa.datatable;

import java.util.LinkedHashMap;

public interface ExportFile {
	public String export(DataTable dt,
			LinkedHashMap<String, Integer> columnsTypes);
}