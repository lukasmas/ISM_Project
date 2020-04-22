export class User {
  public email: string;
  public username: string;
  public firstName: string;
  public lastName: string;
  public password: string;
  public userStatus: number;
  public profileId: number;

  constructor(email: string, username: string, firstName: string, lastName: string, password: string, userStatus: number, profileId: number) {
    this.email = email;
    this.username = username;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
    this.userStatus = userStatus;
    this.profileId = profileId;
  }
}
