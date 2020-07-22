import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuarioPerfisComponent } from './usuario-perfis.component';

describe('UsuarioPerfisComponent', () => {
  let component: UsuarioPerfisComponent;
  let fixture: ComponentFixture<UsuarioPerfisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsuarioPerfisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsuarioPerfisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
