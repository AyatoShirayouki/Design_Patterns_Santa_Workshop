package Entities;

import java.util.Date;

public class Workshop implements WorkshopInterface {

	private Toy toy;

    private Date getCurrentDate(){
        Date currentDate = new Date();
        return currentDate;
    }
	
	@Override
	public Toy createToy(String createdBy, String toyType, String... toyDetails) {
		if (toyType.equalsIgnoreCase("кукла")){
            toy = new Doll(this.getCurrentDate(),createdBy,toyType, toyDetails);
        }else if(toyType.equalsIgnoreCase("колело")){
            toy = new Bike(this.getCurrentDate(),createdBy,toyType, toyDetails);
        }

        return toy;
	}
}
