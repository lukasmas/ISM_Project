import {Component, ElementRef, OnInit, ViewChild} from '@angular/core';
import {User} from "../model/user.model";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  @ViewChild('password', {static: false}) passwordInputRef: ElementRef;
  @ViewChild('confirmedPassword', {static: false}) passwordConfInputRef: ElementRef;
  @ViewChild('firstName', {static: false}) firstNameInputRef: ElementRef;
  @ViewChild('lastName', {static: false}) lastNameInputRef: ElementRef;
  @ViewChild('email', {static: false}) emailInputRef: ElementRef;
  @ViewChild('username', {static: false}) usernameInputRef: ElementRef;

  constructor() { }

  ngOnInit(): void {
  }

  onSignUp() {
    if (this.passwordConfInputRef.nativeElement.value.length === 0 ||
      this.passwordInputRef.nativeElement.value.length === 0) {
      return;
    }
    const u = new User(
      this.emailInputRef.nativeElement.value,
      this.usernameInputRef.nativeElement.value,
      this.firstNameInputRef.nativeElement.value,
      this.lastNameInputRef.nativeElement.value,
      this.passwordInputRef.nativeElement.value,
      0,
      0
    );
    console.log(u);
  }

}
