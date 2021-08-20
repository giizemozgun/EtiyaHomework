export default class SellingService{
    constructor(){
        this.users = []
        this.games =[]
    }

    sell(user,game){

        if(user.age < game.minAge){
            console.log("Oyunun yaşı minimum " + game.minAge + " olduğundan satın alamazsınız.")
        }else{
            console.log(user.name + "," +  game.name + " oyununu satın aldınız.")
        }
    }

}