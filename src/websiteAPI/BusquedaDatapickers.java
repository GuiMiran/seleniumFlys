package websiteAPI;

import org.jboss.netty.handler.codec.http.multipart.DiskAttribute;

public class BusquedaDatapickers {
	
	private String mesBusqueda;
	private String diaBusqueda;
	
	
	public String getMesBusqueda() {
		return mesBusqueda;
	}

	public void setMesBusqueda(String mesBusqueda) {
		this.mesBusqueda = mesBusqueda;
	}
	

	public String getDiaBusqueda() {
		return diaBusqueda;
	}

	public void setDiaBusqueda(String diaBusqueda) {
		this.diaBusqueda = diaBusqueda;
	}
	
	
	public BusquedaDatapickers(String dia)
	{
		setDiaBusqueda(dia);
				
	}
	
	public void buscarMes (String Mes, String path )
	{
		//*[@id="datePickerContainer"]/div[1]/div/div/span[1]
		//*[@id="datePickerContainer"]/div[1]/div/div/span[1]
		
		 
	}

	

}
