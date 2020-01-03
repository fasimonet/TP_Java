public class Camion 
{
    //#region Fields
    private StringBuilder _immat;
    private int _couleur;
    private int _places;
    //#endregion

    //#region Constructors
    public Camion()
    {
        setImmat("21 PREM 21");
        setCouleur(2);
        setPlaces(10);
    }

    public Camion(StringBuilder immat, int couleur, int places)
    {
        setImmat(immat);
        setCouleur(couleur);
        setPlaces(places);
    }
    //#endregion

    //#region Getters / Setters
    public StringBuilder getImmat()
    {
        return _immat;
    }

    public void setImmat(StringBuilder immat)
    {
        immat = _immat;
    }

    public int getCouleur()
    {
        return _couleur;
    }

    public void setCouleur(int couleur)
    {
        _couleur = couleur;
    }

    public int getPlaces()
    {
        return _places;
    }

    public void setPlaces(int places)
    {
        _places = places;
    }
    //#endregion

}