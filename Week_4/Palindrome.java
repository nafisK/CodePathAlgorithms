"SELECT al.Name AS 'Nephew', bl.Name AS 'Nephew of'\n" +
                            "FROM (select * from Persons\n" +
                            "WHERE ID IN ((SELECT personId \n" +
                            "FROM Family F1 \n" +
                            "WHERE F1.fatherId IN (SELECT brotherid \n" +
                            "FROM Brothers F2 WHERE F2.childId = " + personId + " and Sex = 'M')) \n" +
                            "UNION\n" +
                            "(SELECT personId \n" + "FROM Family F1 \n" +
                            "WHERE F1.fatherId IN (SELECT brotherid \n" +
                            "FROM brothersisters bs \n" +
                            "WHERE bs.sisterId IN (SELECT wifeId " +
                            "                               FROM spouses S WHERE s.husbandId = " + personId + " and Sex = 'M' \n" +
                            "UNION\n" +
                            "(SELECT personId \n" + "FROM Family F1 \n" +
                            "WHERE F1.fatherId IN (SELECT brotherid \n" +
                            "FROM brothers b\n" +
                            "WHERE b.childId IN (SELECT husbandId FROM spouses s WHERE s.wifeId = " + personId + " and Sex = 'M' )))\n" +
                            "UNION\n" +
                            "(SELECT personId FROM Family F1 WHERE F1.fatherId = (SELECT husbandId FROM spouses s WHERE s.wifeId IN\n" +
                            "(SELECT sisterId FROM brothersisters bs WHERE bs.brotherId = " + personId + " and Sex = 'M')) ) \n" +
                            "UNION\n" +
                            "(SELECT personId FROM Family F1 WHERE F1.fatherId = (SELECT husbandId FROM spouses s WHERE s.wifeId IN\n" +
                            "(SELECT sisterId FROM sisters ss WHERE ss.childId = " + personId + " and Sex = 'M'))\n" +
                            "UNION\n" +
                            "(SELECT personId FROM Family F1 WHERE F1.fatherId = (SELECT husbandId FROM spouses s WHERE s.wifeId IN\n" +
                            "(SELECT sisterId FROM sisters ss WHERE ss.childId IN \n" +
                            "(SELECT wifeId FROM spouses sss WHERE sss.husbandId = " + personId + " and Sex = 'M')))) \n" +
                            "UNION\n" +
                            "(SELECT personId FROM Family F1 WHERE F1.fatherId = (SELECT husbandId FROM spouses s WHERE s.wifeId IN\n" +
                            "(SELECT sisterId FROM brothersisters ss WHERE ss.brotherId IN \n" +
                            "(SELECT husbandId FROM spouses sss WHERE sss.wifeId = " + personId + " and Sex = 'M')))))) al \n" +
                            "join (select Name from persons where Id = " + personId + ") bl";