package in.co.pro4.bean;


/**
 * DropdownList interface is implemented by Beans those are used to create drop down list on HTML pages
 * 
 * @author Sourav Jagirdar
 *
 */
public interface DropdownListBean {
	
    /**
     * Returns key of list element
     *
     * @return key
     */
	public String getKey();
	
    /**
     * Returns display text of list element
     *
     * @return value
     */
	public String getValue();
}
