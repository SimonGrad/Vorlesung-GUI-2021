/**
 * Created by dominik.haas on 21.06.18.
 */
export class LocationModel {

  public id: string;
  public name: string;

  public label: string;
  public type: string;
  public subType: string;
  public since: Date;
  public active: boolean;

  public street: string;
  public streetNumber: string;
  public zip: string;
  public city: string;
  public notes: string;

  toString(): string {
    return JSON.stringify(this);
  }
}
