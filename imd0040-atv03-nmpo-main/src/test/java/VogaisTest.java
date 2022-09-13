import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VogaisTest {

    @Test
    void semVogais() {
        Vogais vogais = new Vogais();
        assertEquals(0, vogais.contarVogais("plm"));
    }

    @Test
    void vogaisEmSequencia() {
        Vogais vogais = new Vogais();
        assertEquals(5, vogais.contarVogais("aeiou"));
    }

    @Test
    void vogaisComAcento() {
        Vogais vogais = new Vogais();
        assertEquals(22, vogais.contarVogais("aáàâã eéêè iíìî oóòôõ uúùû"));
    }

    @Test
    void vogaisNoTexto() {
        Vogais vogais = new Vogais();
        assertEquals(22, vogais.contarVogais("L a P á h à y â ã b e N é M ê 6 è 2 i V í b ì r î o V ó C ò x ô z u q ú w ù t G û õ"));
    }

    @Test
    void vogaisMaisculas() {
        Vogais vogais = new Vogais();
        assertEquals(22, vogais.contarVogais("AÁÀÂÃ EÉÊÈ IÍÌÎ OÓÒÔÕ UÚÙÛ"));
    }

    @Test
    void loremIpsum() {
        Vogais vogais = new Vogais();
        assertEquals(168, vogais.contarVogais("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
    }





}