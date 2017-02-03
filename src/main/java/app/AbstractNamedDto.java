package app;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public abstract class AbstractNamedDto {

	protected String name;
	protected Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected LocalDate getLocalDate() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
				calendar.get(Calendar.DAY_OF_MONTH));
	}
}
