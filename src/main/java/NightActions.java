public class NightActions {
    public void performNightAction(Roles role) {

        switch (role) {
            case Villager:
                break;

            case Seer:
                // Action for Seer
                break;

            case Apprentice_Seer:
                // Action for Apprentice Seer
                break;

            case Aura_Seer:
                // Action for Aura Seer
                break;

            case Ghost:
                // Action for Ghost
                break;

            case Private_Investigator:
                // Action for Private Investigator
                break;

            case Clockmaker:
                // Action for Clockmaker
                break;

            case Tracker:
                // Action for Tracker
                break;

            case Lookout:
                // Action for Lookout
                break;

            case Empath:
                // Action for Empath
                break;

            case Bodyguard:
                // Action for Bodyguard
                break;

            case Witch:
                // Action for Witch
                break;

            case Escort:
                // Action for Escort
                break;

            case Trickster:
                // Action for Trickster
                break;

            case Deputy:
                // Action for Deputy
                break;

            case Vigilante:
                // Action for Vigilante
                break;

            case Veteran:
                // Action for Veteran
                break;

            case Hunter:
                // Action for Hunter
                break;

            case Cupid:
                // Action for Cupid
                break;

            case Lycan:
                // Action for Lycan
                break;

            case Cursed:
                // Action for Cursed
                break;

            case Werewolf:
                // Action for Werewolf
                break;

            case Sorceror:
                // Action for Sorceror
                break;

            case Cubwolf:
                // Action for Cubwolf
                break;

            case Hexwolf:
                // Action for Hexwolf
                break;

            case Mistwolf:
                // Action for Mistwolf
                break;

            case Consort:
                // Action for Consort
                break;

            case Doppelganger:
                // Action for Doppelganger
                break;

            case Tanner:
                // Action for Tanner
                break;

            case Executioner:
                // Action for Executioner
                break;

            case Arsonist:
                // Action for Arsonist
                break;

            case Serial_Killer:
                // Action for Serial Killer
                break;

            case Pestilence:
                // Action for Pestilence
                break;

            case Grave_Digger:
                // Action for Grave Digger
                break;

            case Doom_sayer:
                // Action for Doom Sayer
                break;

            default:
                throw new IllegalArgumentException("Unknown role: " + role);
        }
    }
}