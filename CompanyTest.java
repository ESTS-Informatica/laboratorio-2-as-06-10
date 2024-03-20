

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest
{
    Company company1;
    User client1;
    User client2;
    User seller1;
    User seller2;
    /**
     * Construtor default para a classe de teste CompanyTest
     */
    public CompanyTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        this.company1 = new Company();
        this.client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        this.client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        this.seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        this.seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testConstructor(){
        this.company1.registerClient(this.client1);
        assertEquals(true, this.company1.registerClient(this.client1));
        
        this.company1.registerClient(this.client2);
        assertEquals(true, this.company1.registerClient(this.client2));
        
        this.company1.registerSeller(this.seller1);
        assertEquals(true, this.company1.registerSeller(this.seller1));
        
        this.company1.registerSeller(this.seller2);
        assertEquals(true, this.company1.registerSeller(this.seller2));
    }
    
    @Test
    public void testRegisterClient(){
        User client3 = new User("Albino", "911111115", "ab@gmail.pt");
        this.company1.registerClient(client3);
        assertTrue(this.company1.registerClient(client3));
    }
    
    @Test
    public void testRegisterClients(){
        User client4 = new User("Albino3", "911111415", "abd@gmail.pt");
        User client5 = new User("Albino4", "911151115", "abe@gmail.pt");
        this.company1.registerClient(client4);
        this.company1.registerClient(client4);
        assertTrue(this.company1.registerClient(client4));
        assertTrue(this.company1.registerClient(client5));
    }
    
    @Test
    public void testRegisterClientDuplicate(){
        
    }
    
    @Test
    public void testRegisterClientNull(){
        User client6 = null;
        this.company1.registerClient(client6);
        assertFalse(this.company1.registerClient(client6));
    }
}
