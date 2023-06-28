package DependencyInversion;
public class Botao
{
    private Dispositivo _dispositivo;

    public void Acionar()
    {
        if (condicao)
            _dispositivo.Ligar();
    }
}