/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.care.gridview;

/**
 *
 * @author jakubmol
 */
public class GridViewBuilder {
public static String tempTable =  "<table class=\"table table-striped\">\n" +
"                        <thead class=\"thead-light\">\n" +
"                            <tr>\n" +
"                                <th scope=\"col\">NHS Number</th>\n" +
"                                <th scope=\"col\">First name</th>\n" +
"                                <th scope=\"col\">Last name</th>\n" +
"                                <th scope=\"col\">Email</th>\n" +
"                                <th scope=\"col\">Time</th>\n" +
"                                <th scope=\"col\">Date</th>\n" +
"                                <th scope=\"col\">NHS/Private</th>\n" +
"                                <th scope=\"col\">Service</th>\n" +
"                                <th scope=\"col\">Cost</th>\n" +
"                                <th scope=\"col\">Prescribed</th>\n" +
"\n" +
"\n" +
"                                <th scope=\"col\">Delete</th>\n" +
"                                <th scope=\"col\">Update</th>\n" +
"                                <th scope=\"col\">Issue Prescription</th>\n" +
"                            </tr>\n" +
"                        </thead>\n" +
"                        <tbody>\n" +
"                            <tr>\n" +
"                                <th scope=\"row\">1304666</th>\n" +
"                                <td>Mark</td>\n" +
"                                <td>Otto</td>\n" +
"                                <td>MarkOtto@mail.com</td>\n" +
"                                <td>11:00</td>\n" +
"                                <td>17.12.2020</td>\n" +
"                                <td>NHS</td>\n" +
"                                <td>Surgery</td>\n" +
"                                <td>1000</td>\n" +
"                                <td>No</td>\n" +
"\n" +
"                                <td><a href=\"deletePatient.jsp?id=>\">Delete</a></td>                             \n" +
"                                <td><a href=\"updatePatient.jsp?id=>\">Update</a></td>\n" +
"                                <td><a href=\"issuePerscription.jsp?id=>\">Issue</a></td>\n" +
"                            </tr>\n" +
"\n" +
"                            <tr>\n" +
"                                <th scope=\"row\">1304560</th>\n" +
"                                <td>Emma</td>\n" +
"                                <td>West</td>\n" +
"                                <td>EmmaWest@mail.com</td>\n" +
"                                <td>13:00</td>\n" +
"                                <td>19.12.2020</td>\n" +
"                                <td>Private</td>\n" +
"                                <td>Consultation</td>\n" +
"                                <td>5600</td>\n" +
"                                <td>Yes</td>\n" +
"\n" +
"                                <td><a href=\"deletePatient.jsp?id=>\">Delete</a></td>                             \n" +
"                                <td><a href=\"updatePatient.jsp?id=>\">Update</a></td>\n" +
"                                <td><a href=\"issuePerscription.jsp?id=>\">Issue</a></td>\n" +
"                            </tr>  \n" +
"                                                       \n" +
"                            <tr>\n" +
"                                <th scope=\"row\">1304560</th>\n" +
"                                <td>Emma</td>\n" +
"                                <td>West</td>\n" +
"                                <td>EmmaWest@mail.com</td>\n" +
"                                <td>13:00</td>\n" +
"                                <td>19.12.2020</td>\n" +
"                                <td>Private</td>\n" +
"                                <td>Consultation</td>\n" +
"                                <td>5600</td>\n" +
"                                <td>Yes</td>\n" +
"\n" +
"                                <td><a href=\"deletePatient.jsp?id=>\">Delete</a></td>                             \n" +
"                                <td><a href=\"updatePatient.jsp?id=>\">Update</a></td>\n" +
"                                <td><a href=\"issuePerscription.jsp?id=>\">Issue</a></td>\n" +
"                            </tr>  \n" +
"                        </tbody>\n" +
"                    </table>";
}